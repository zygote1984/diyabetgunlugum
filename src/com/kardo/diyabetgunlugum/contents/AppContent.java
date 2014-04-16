package com.kardo.diyabetgunlugum.contents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class AppContent {

    public static List<ContentItem> ITEMS = new ArrayList<ContentItem>();

    public static Map<String, ContentItem> ITEM_MAP = new HashMap<String, ContentItem>();

    static {
        // Add 3 sample items.
        addItem(new ContentItem("1", "Gunluk"));
        addItem(new ContentItem("2", "Grafikler"));
        addItem(new ContentItem("3", "Notlar"));
    }

    private static void addItem(ContentItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class ContentItem {
        public String id;
        public String content;

        public ContentItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
