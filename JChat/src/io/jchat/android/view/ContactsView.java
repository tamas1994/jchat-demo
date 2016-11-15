package io.jchat.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import io.jchat.android.R;
import io.jchat.android.adapter.ContactsListAdapter;


public class ContactsView extends LinearLayout{

	private TextView mTitle;
    private Context mContext;
	private ListView mListView;
	
	public ContactsView(Context context, AttributeSet attrs) {
		super(context, attrs);
        this.mContext = context;
		// TODO Auto-generated constructor stub
	}
	
	public void initModule(){
        mTitle = (TextView) findViewById(R.id.title_bar_title);
        mTitle.setText(mContext.getString(R.string.actionbar_contact));
        mListView = (ListView) findViewById(R.id.contact_list_view);
	}

	public void setAdapter(ContactsListAdapter adapter) {
		mListView.setAdapter(adapter);
	}

    public void setItemListeners(AdapterView.OnItemClickListener onClickListener) {
        mListView.setOnItemClickListener(onClickListener);
    }
}
