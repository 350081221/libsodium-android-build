.class public Lmirror/android/location/GeocoderParams;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static mPackageName:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static mUid:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/location/GeocoderParams;

    const-string v1, "android.location.GeocoderParams"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/location/GeocoderParams;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static mPackageName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/location/GeocoderParams;->mPackageName:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static mPackageName(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/location/GeocoderParams;->mPackageName:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static mUid(Ljava/lang/Object;)I
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/location/GeocoderParams;->mUid:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static mUid(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/location/GeocoderParams;->mUid:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
