.class public Lmirror/android/app/ActivityClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmirror/android/app/ActivityClient$ActivityClientControllerSingleton;
    }
.end annotation


# static fields
.field public static INTERFACE_SINGLETON:Lmirror/RefStaticObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticObject<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static getActivityClientController:Lmirror/RefStaticMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticMethod<",
            "Landroid/os/IInterface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/app/ActivityClient;

    const-string v1, "android.app.ActivityClient"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/app/ActivityClient;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
