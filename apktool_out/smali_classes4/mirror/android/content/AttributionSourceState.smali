.class public Lmirror/android/content/AttributionSourceState;
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

.field public static next:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "[",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field public static packageName:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static pid:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static token:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field

.field public static uid:Lmirror/RefObject;
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

    const-class v0, Lmirror/android/content/AttributionSourceState;

    const-string v1, "android.content.AttributionSourceState"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/content/AttributionSourceState;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static next(Ljava/lang/Object;[Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/content/AttributionSourceState;->next:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static next(Ljava/lang/Object;)[Landroid/os/Parcelable;
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/content/AttributionSourceState;->next:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroid/os/Parcelable;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static packageName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/content/AttributionSourceState;->packageName:Lmirror/RefObject;

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

.method public static packageName(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/content/AttributionSourceState;->packageName:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static token(Ljava/lang/Object;)Landroid/os/IBinder;
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/content/AttributionSourceState;->token:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static token(Ljava/lang/Object;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/content/AttributionSourceState;->token:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static uid(Ljava/lang/Object;)I
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/content/AttributionSourceState;->uid:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 5
    :cond_0
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result p0

    return p0
.end method

.method public static uid(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/content/AttributionSourceState;->uid:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
