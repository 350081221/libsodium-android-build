package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i5) {
            return new RatingCompat[i5];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface Style {
    }

    RatingCompat(int i5, float f5) {
        this.mRatingStyle = i5;
        this.mRatingValue = f5;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = newUnratedRating(ratingStyle);
            }
            ratingCompat.mRatingObj = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat newHeartRating(boolean z4) {
        return new RatingCompat(1, z4 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f5) {
        if (f5 >= 0.0f && f5 <= 100.0f) {
            return new RatingCompat(6, f5);
        }
        Log.e(TAG, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i5, float f5) {
        float f6;
        if (i5 != 3) {
            if (i5 != 4) {
                if (i5 != 5) {
                    Log.e(TAG, "Invalid rating style (" + i5 + ") for a star rating");
                    return null;
                }
                f6 = 5.0f;
            } else {
                f6 = 4.0f;
            }
        } else {
            f6 = 3.0f;
        }
        if (f5 >= 0.0f && f5 <= f6) {
            return new RatingCompat(i5, f5);
        }
        Log.e(TAG, "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat newThumbRating(boolean z4) {
        return new RatingCompat(2, z4 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i5) {
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i5, RATING_NOT_RATED);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.mRatingStyle;
    }

    public float getPercentRating() {
        if (this.mRatingStyle == 6 && isRated()) {
            return this.mRatingValue;
        }
        return RATING_NOT_RATED;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000c. Please report as an issue. */
    public Object getRating() {
        if (this.mRatingObj == null) {
            if (isRated()) {
                int i5 = this.mRatingStyle;
                switch (i5) {
                    case 1:
                        this.mRatingObj = Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.mRatingObj = Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.mRatingObj = Rating.newStarRating(i5, getStarRating());
                        break;
                    case 6:
                        this.mRatingObj = Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.mRatingObj = Rating.newUnratedRating(this.mRatingStyle);
            }
        }
        return this.mRatingObj;
    }

    public int getRatingStyle() {
        return this.mRatingStyle;
    }

    public float getStarRating() {
        int i5 = this.mRatingStyle;
        if ((i5 == 3 || i5 == 4 || i5 == 5) && isRated()) {
            return this.mRatingValue;
        }
        return RATING_NOT_RATED;
    }

    public boolean hasHeart() {
        if (this.mRatingStyle != 1 || this.mRatingValue != 1.0f) {
            return false;
        }
        return true;
    }

    public boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public boolean isThumbUp() {
        if (this.mRatingStyle != 2 || this.mRatingValue != 1.0f) {
            return false;
        }
        return true;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.mRatingStyle);
        sb.append(" rating=");
        float f5 = this.mRatingValue;
        if (f5 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f5);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
