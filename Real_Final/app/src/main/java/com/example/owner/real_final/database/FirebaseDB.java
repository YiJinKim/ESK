package com.example.owner.real_final.database;

import android.support.annotation.NonNull;
import android.widget.Toast;

import com.example.owner.real_final.activity.LoginActivity;
import com.example.owner.real_final.activity.SignUpActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by vns on 2018-03-21.
 */

public class FirebaseDB {
    FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    String uid;
    //사용자 uid가져오기
    public FirebaseDB(){
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        uid=currentUser.getUid();
    }
    //여행목록 추가,삭제,업데이트
    public void addTravelList(){
        //DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference("member");
        //DatabaseReference myRef = rootRef.getRoot();
        DatabaseReference mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference();
        String key = mDatabase.child("posts").push().getKey();
        TravelData td = new TravelData(key,"10000","france","2018-03-16","2018-03-20");
        mDatabase.child("member").child(uid).child(key).setValue(td);

        //Toast.makeText(LoginActivity.this, idToken, Toast.LENGTH_LONG).show();
        //Toast.makeText(LoginActivity.this, proiver, Toast.LENGTH_LONG).show();
        //


        //Toast.makeText(LoginActivity.this, name, Toast.LENGTH_LONG).show();
        /*rootRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                for (DataSnapshot messageData : dataSnapshot.getChildren()) {
                    MemberData md = messageData.getValue(MemberData.class);

                    //Toast.makeText(LoginActivity.this, md.getName(), Toast.LENGTH_LONG).show();
                    // child 내에 있는 데이터만큼 반복합니다.

                }
                //MemberData member = dataSnapshot.child("member").getValue(Member.class);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });*/


    }
    //날짜별 레스토랑 메뉴 목록 추가,삭제,업데이트

    //로그아웃
    public void signOut() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        mAuth.signOut();
        //updateUI(null);
    }

}
