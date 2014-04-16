package com.kardo.diyabetgunlugum;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.kardo.diyabetgunlugum.contents.AppContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private AppContent.ContentItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = AppContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
        View rootView;
		if (mItem.content.equals("Gunluk")) {
			rootView = inflater.inflate(R.layout.activity_diary, container,
					false);
			CalendarView view = ((CalendarView) rootView.findViewById(R.id.diary_calendar));
			view.setOnDateChangeListener(new OnDateChangeListener() {
				@Override
				public void onSelectedDayChange(CalendarView view, int year, int month,
						int dayOfMonth) {
					Toast.makeText(getActivity(), "Kardoloo", Toast.LENGTH_SHORT).show();			
				}
			});
		} else {
			rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);
			((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
        }

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            
        }

        return rootView;
    }
}
