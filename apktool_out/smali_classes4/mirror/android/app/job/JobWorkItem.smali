.class public Lmirror/android/app/job/JobWorkItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation


# static fields
.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static ctor:Lmirror/RefConstructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefConstructor<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmirror/MethodParams;
        value = {
            Landroid/content/Intent;
        }
    .end annotation
.end field

.field public static getIntent:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public static mDeliveryCount:Lmirror/RefInt;

.field public static mGrants:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static mWorkId:Lmirror/RefInt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/app/job/JobWorkItem;

    const-class v1, Landroid/app/job/JobWorkItem;

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/app/job/JobWorkItem;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
