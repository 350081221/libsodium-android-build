.class public Lmirror/com/android/internal/policy/PhoneWindow;
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

.field public static sWindowManager:Lmirror/RefStaticObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticObject<",
            "Landroid/os/IInterface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.android.internal.policy.impl.PhoneWindow$WindowManagerHolder"

    .line 2
    .line 3
    const-class v1, Lmirror/com/android/internal/policy/PhoneWindow;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lmirror/com/android/internal/policy/PhoneWindow;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "com.android.internal.policy.PhoneWindow$WindowManagerHolder"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lmirror/com/android/internal/policy/PhoneWindow;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
