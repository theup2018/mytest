package com.death.uttamtutorial.adapter;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.death.uttamtutorial.R;
import com.death.uttamtutorial.model.DataItem;
import com.death.uttamtutorial.model.SubcategoryItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SimpleListAdapter implements ExpandableListAdapter {

    List<DataItem> responseList;
    Context context;

    public SimpleListAdapter(List<DataItem> responseList, Context context) {
        this.responseList = responseList;
        this.context = context;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getGroupCount() {
        return responseList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return responseList.get(groupPosition).getSubcategory().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return responseList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return responseList.get(groupPosition).getSubcategory().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return responseList.get(groupPosition).getId();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return responseList.get(groupPosition).getSubcategory().get(childPosition).getId();
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String listTitle = ((DataItem) getGroup(groupPosition)).getName();
        String iconUrl = ((DataItem) getGroup(groupPosition)).getMenuIcon();
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.single_items, null);
        }
        TextView listTitleTextView = (TextView) convertView
                .findViewById(R.id.groupname);
        ImageView iconImageView = convertView.findViewById(R.id.category_icon);

        Picasso.get().load(iconUrl).into(iconImageView);
        listTitleTextView.setTypeface(null, Typeface.BOLD);
        listTitleTextView.setText(listTitle);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String expandedListText = ((SubcategoryItem) getChild(groupPosition, childPosition)).getName();
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.single_item_child, null);
        }
        TextView expandedListTextView = (TextView) convertView
                .findViewById(R.id.subcategory);
        expandedListTextView.setText(expandedListText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void onGroupExpanded(int groupPosition) {

    }

    @Override
    public void onGroupCollapsed(int groupPosition) {

    }

    @Override
    public long getCombinedChildId(long groupId, long childId) {
        return 0;
    }

    @Override
    public long getCombinedGroupId(long groupId) {
        return 0;
    }
}
