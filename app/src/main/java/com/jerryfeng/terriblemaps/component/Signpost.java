package com.jerryfeng.terriblemaps.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.jerryfeng.terriblemaps.R;

/**
 * Created by Kevin on 04/10/2015.
 */
public class Signpost extends ImageView {

    public Signpost(Context context) {
        super(context);
        init();
    }

    public Signpost(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Signpost(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sign_post);
        bitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() * 10, bitmap.getHeight() * 10, false);

        this.setImageBitmap(bitmap);
    }

    public void setHeading(float degree) {
        this.setRotation(degree);

        // create a rotation animation (reverse turn degree degrees)

        /*
        RotateAnimation ra = new RotateAnimation(
                mCurrentDegree,
                -degree,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF,
                0.5f);

        // how long the animation will take place
        ra.setDuration(210);

        // set the animation after the end of the reservation status
        ra.setFillAfter(true);

        // Start the animation
        this.startAnimation(ra);
        mCurrentDegree = -degree;
        */

        this.setRotation(-degree);
    }

}
