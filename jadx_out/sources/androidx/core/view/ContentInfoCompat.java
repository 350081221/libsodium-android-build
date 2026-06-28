package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;

    @NonNull
    private final Compat mCompat;

    @RequiresApi(31)
    /* loaded from: classes2.dex */
    private static final class Api31Impl {
        private Api31Impl() {
        }

        @NonNull
        @DoNotInline
        public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull final Predicate<ClipData.Item> predicate) {
            ClipData clip;
            ContentInfo.Builder clip2;
            ContentInfo build;
            ContentInfo.Builder clip3;
            ContentInfo build2;
            ContentInfo contentInfo2;
            clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                if (test) {
                    contentInfo2 = contentInfo;
                } else {
                    contentInfo2 = null;
                }
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> partition = ContentInfoCompat.partition(clip, (androidx.core.util.Predicate<ClipData.Item>) new androidx.core.util.Predicate() { // from class: androidx.core.view.d
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (partition.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (partition.second == null) {
                return Pair.create(contentInfo, null);
            }
            clip2 = new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.first);
            build = clip2.build();
            clip3 = new ContentInfo.Builder(contentInfo).setClip((ClipData) partition.second);
            build2 = clip3.build();
            return Pair.create(build, build2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface BuilderCompat {
        @NonNull
        ContentInfoCompat build();

        void setClip(@NonNull ClipData clipData);

        void setExtras(@Nullable Bundle bundle);

        void setFlags(int i5);

        void setLinkUri(@Nullable Uri uri);

        void setSource(int i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface Compat {
        @NonNull
        ClipData getClip();

        @Nullable
        Bundle getExtras();

        int getFlags();

        @Nullable
        Uri getLinkUri();

        int getSource();

        @Nullable
        ContentInfo getWrapped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(31)
    /* loaded from: classes2.dex */
    public static final class Compat31Impl implements Compat {

        @NonNull
        private final ContentInfo mWrapped;

        Compat31Impl(@NonNull ContentInfo contentInfo) {
            this.mWrapped = (ContentInfo) Preconditions.checkNotNull(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        public ClipData getClip() {
            ClipData clip;
            clip = this.mWrapped.getClip();
            return clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Bundle getExtras() {
            Bundle extras;
            extras = this.mWrapped.getExtras();
            return extras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            int flags;
            flags = this.mWrapped.getFlags();
            return flags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Uri getLinkUri() {
            Uri linkUri;
            linkUri = this.mWrapped.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            int source;
            source = this.mWrapped.getSource();
            return source;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        public ContentInfo getWrapped() {
            return this.mWrapped;
        }

        @NonNull
        public String toString() {
            return "ContentInfoCompat{" + this.mWrapped + a1.i.f138d;
        }
    }

    /* loaded from: classes2.dex */
    private static final class CompatImpl implements Compat {

        @NonNull
        private final ClipData mClip;

        @Nullable
        private final Bundle mExtras;
        private final int mFlags;

        @Nullable
        private final Uri mLinkUri;
        private final int mSource;

        CompatImpl(BuilderCompatImpl builderCompatImpl) {
            this.mClip = (ClipData) Preconditions.checkNotNull(builderCompatImpl.mClip);
            this.mSource = Preconditions.checkArgumentInRange(builderCompatImpl.mSource, 0, 5, "source");
            this.mFlags = Preconditions.checkFlagsArgument(builderCompatImpl.mFlags, 1);
            this.mLinkUri = builderCompatImpl.mLinkUri;
            this.mExtras = builderCompatImpl.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        public ClipData getClip() {
            return this.mClip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Bundle getExtras() {
            return this.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mFlags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public Uri getLinkUri() {
            return this.mLinkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mSource;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        public ContentInfo getWrapped() {
            return null;
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.mClip.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.sourceToString(this.mSource));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.flagsToString(this.mFlags));
            String str2 = "";
            if (this.mLinkUri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.mLinkUri.toString().length() + ")";
            }
            sb.append(str);
            if (this.mExtras != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append(a1.i.f138d);
            return sb.toString();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Source {
    }

    ContentInfoCompat(@NonNull Compat compat) {
        this.mCompat = compat;
    }

    @NonNull
    static ClipData buildClipData(@NonNull ClipDescription clipDescription, @NonNull List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i5 = 1; i5 < list.size(); i5++) {
            clipData.addItem(list.get(i5));
        }
        return clipData;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String flagsToString(int i5) {
        if ((i5 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i5);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String sourceToString(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? String.valueOf(i5) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @NonNull
    @RequiresApi(31)
    public static ContentInfoCompat toContentInfoCompat(@NonNull ContentInfo contentInfo) {
        return new ContentInfoCompat(new Compat31Impl(contentInfo));
    }

    @NonNull
    public ClipData getClip() {
        return this.mCompat.getClip();
    }

    @Nullable
    public Bundle getExtras() {
        return this.mCompat.getExtras();
    }

    public int getFlags() {
        return this.mCompat.getFlags();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.mCompat.getLinkUri();
    }

    public int getSource() {
        return this.mCompat.getSource();
    }

    @NonNull
    public Pair<ContentInfoCompat, ContentInfoCompat> partition(@NonNull androidx.core.util.Predicate<ClipData.Item> predicate) {
        ClipData clip = this.mCompat.getClip();
        if (clip.getItemCount() == 1) {
            boolean test = predicate.test(clip.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair<ClipData, ClipData> partition = partition(clip, predicate);
        if (partition.first == null) {
            return Pair.create(null, this);
        }
        if (partition.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new Builder(this).setClip((ClipData) partition.first).build(), new Builder(this).setClip((ClipData) partition.second).build());
    }

    @NonNull
    @RequiresApi(31)
    public ContentInfo toContentInfo() {
        ContentInfo wrapped = this.mCompat.getWrapped();
        Objects.requireNonNull(wrapped);
        return wrapped;
    }

    @NonNull
    public String toString() {
        return this.mCompat.toString();
    }

    @RequiresApi(31)
    /* loaded from: classes2.dex */
    private static final class BuilderCompat31Impl implements BuilderCompat {

        @NonNull
        private final ContentInfo.Builder mPlatformBuilder;

        BuilderCompat31Impl(@NonNull ClipData clipData, int i5) {
            this.mPlatformBuilder = new ContentInfo.Builder(clipData, i5);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        @NonNull
        public ContentInfoCompat build() {
            ContentInfo build;
            build = this.mPlatformBuilder.build();
            return new ContentInfoCompat(new Compat31Impl(build));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(@NonNull ClipData clipData) {
            this.mPlatformBuilder.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(@Nullable Bundle bundle) {
            this.mPlatformBuilder.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i5) {
            this.mPlatformBuilder.setFlags(i5);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(@Nullable Uri uri) {
            this.mPlatformBuilder.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i5) {
            this.mPlatformBuilder.setSource(i5);
        }

        BuilderCompat31Impl(@NonNull ContentInfoCompat contentInfoCompat) {
            this.mPlatformBuilder = new ContentInfo.Builder(contentInfoCompat.toContentInfo());
        }
    }

    /* loaded from: classes2.dex */
    private static final class BuilderCompatImpl implements BuilderCompat {

        @NonNull
        ClipData mClip;

        @Nullable
        Bundle mExtras;
        int mFlags;

        @Nullable
        Uri mLinkUri;
        int mSource;

        BuilderCompatImpl(@NonNull ClipData clipData, int i5) {
            this.mClip = clipData;
            this.mSource = i5;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        @NonNull
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(@NonNull ClipData clipData) {
            this.mClip = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(@Nullable Bundle bundle) {
            this.mExtras = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int i5) {
            this.mFlags = i5;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(@Nullable Uri uri) {
            this.mLinkUri = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int i5) {
            this.mSource = i5;
        }

        BuilderCompatImpl(@NonNull ContentInfoCompat contentInfoCompat) {
            this.mClip = contentInfoCompat.getClip();
            this.mSource = contentInfoCompat.getSource();
            this.mFlags = contentInfoCompat.getFlags();
            this.mLinkUri = contentInfoCompat.getLinkUri();
            this.mExtras = contentInfoCompat.getExtras();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        @NonNull
        private final BuilderCompat mBuilderCompat;

        public Builder(@NonNull ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(contentInfoCompat);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(contentInfoCompat);
            }
        }

        @NonNull
        public ContentInfoCompat build() {
            return this.mBuilderCompat.build();
        }

        @NonNull
        public Builder setClip(@NonNull ClipData clipData) {
            this.mBuilderCompat.setClip(clipData);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mBuilderCompat.setExtras(bundle);
            return this;
        }

        @NonNull
        public Builder setFlags(int i5) {
            this.mBuilderCompat.setFlags(i5);
            return this;
        }

        @NonNull
        public Builder setLinkUri(@Nullable Uri uri) {
            this.mBuilderCompat.setLinkUri(uri);
            return this;
        }

        @NonNull
        public Builder setSource(int i5) {
            this.mBuilderCompat.setSource(i5);
            return this;
        }

        public Builder(@NonNull ClipData clipData, int i5) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.mBuilderCompat = new BuilderCompat31Impl(clipData, i5);
            } else {
                this.mBuilderCompat = new BuilderCompatImpl(clipData, i5);
            }
        }
    }

    @NonNull
    static Pair<ClipData, ClipData> partition(@NonNull ClipData clipData, @NonNull androidx.core.util.Predicate<ClipData.Item> predicate) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i5 = 0; i5 < clipData.getItemCount(); i5++) {
            ClipData.Item itemAt = clipData.getItemAt(i5);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(buildClipData(clipData.getDescription(), arrayList), buildClipData(clipData.getDescription(), arrayList2));
    }

    @NonNull
    @RequiresApi(31)
    public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
        return Api31Impl.partition(contentInfo, predicate);
    }
}
