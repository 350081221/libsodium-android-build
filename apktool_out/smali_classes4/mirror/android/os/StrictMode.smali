.class public Lmirror/android/os/StrictMode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static DETECT_VM_FILE_URI_EXPOSURE:Lmirror/RefStaticInt;

.field public static PENALTY_DEATH_ON_FILE_URI_EXPOSURE:Lmirror/RefStaticInt;

.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static disableDeathOnFileUriExposure:Lmirror/RefStaticMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticMethod<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public static sVmPolicyMask:Lmirror/RefStaticInt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/os/StrictMode;

    const-string v1, "android.os.StrictMode"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/os/StrictMode;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
