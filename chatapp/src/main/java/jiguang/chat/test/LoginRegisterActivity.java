package jiguang.chat.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.socks.library.KLog;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.api.BasicCallback;
import jiguang.chat.R;

/**
 * Created by Tamas on 2017/11/16.
 */

public class LoginRegisterActivity extends Activity {


    @Bind(R.id.et_user_name)
    EditText mEtUserName;
    @Bind(R.id.et_password)
    EditText mEtPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_login)
    public void onBtnLoginClicked(View view){
        String userName=mEtUserName.getEditableText().toString();
        String password=mEtPassword.getEditableText().toString();

        JMessageClient.login(userName, password, new BasicCallback() {
            @Override
            public void gotResult(int i, String s) {
                KLog.i("i:"+i+"  s:"+s);
            }
        });


    }

    @OnClick(R.id.btn_register)
    public void onBtnRegisterClicked(View view){
        String userName=mEtUserName.getEditableText().toString();
        String password=mEtPassword.getEditableText().toString();

        JMessageClient.register(userName, password, new BasicCallback() {
            @Override
            public void gotResult(int i, String s) {
                KLog.i("i:"+i+"  s:"+s);
            }
        });

    }

    @OnClick(R.id.btn_logout)
    public void onBtnLogout(View view){
        JMessageClient.logout();


    }
}
