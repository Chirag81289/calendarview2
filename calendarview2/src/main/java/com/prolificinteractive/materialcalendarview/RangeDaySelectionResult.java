package com.prolificinteractive.materialcalendarview;

import android.support.annotation.NonNull;

import com.prolificinteractive.materialcalendarview.DayView.Selection;

/**
 * Created by: Peter Štovka <stovka.peter@gmail.com>
 * Created at: 7/3/17.
 */

public class RangeDaySelectionResult {

    private CalendarDay day;

    @Selection
    private int selection;

    public RangeDaySelectionResult(@NonNull CalendarDay day, @Selection int selection) {
        this.day = day;
        this.selection = selection;
    }

    public CalendarDay getDay() {
        return day;
    }

    public int getSelection() {
        return selection;
    }
}
