/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.xyzreader.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.widget.AppBarLayout;
import android.util.AttributeSet;

/**
 * A simple {@link AppBarLayout} subclass that has a maxWidth
 */
public class MaxWidthAppBarLayout extends AppBarLayout {
    private static final int[] ATTRS = {
            android.R.attr.maxWidth
    };

    private int mMaxWidth = Integer.MAX_VALUE;

    public MaxWidthAppBarLayout(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    public MaxWidthAppBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0, 0);
    }

    public void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = context.obtainStyledAttributes(attrs, ATTRS);
        mMaxWidth = a.getLayoutDimension(0, Integer.MAX_VALUE);
        a.recycle();
    }

    @Override
    public float getElevation() {
        return super.getElevation();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int newSpecWidth = Math.min(MeasureSpec.getSize(widthMeasureSpec), mMaxWidth);
        widthMeasureSpec = MeasureSpec.makeMeasureSpec(newSpecWidth, MeasureSpec.getMode(widthMeasureSpec));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}