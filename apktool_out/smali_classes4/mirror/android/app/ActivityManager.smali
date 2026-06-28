.class public Lmirror/android/app/ActivityManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static START_INTENT_NOT_RESOLVED:Lmirror/RefStaticInt;

.field public static START_NOT_CURRENT_USER_ACTIVITY:Lmirror/RefStaticInt;

.field public static START_TASK_TO_FRONT:Lmirror/RefStaticInt;

.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/app/ActivityManager;

    const-class v1, Landroid/app/ActivityManager;

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/app/ActivityManager;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
