.class public Lmirror/android/content/SyncRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
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

.field public static mAccountToSync:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Landroid/accounts/Account;",
            ">;"
        }
    .end annotation
.end field

.field public static mAuthority:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static mExtras:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public static mIsPeriodic:Lmirror/RefBoolean;

.field public static mSyncFlexTimeSecs:Lmirror/RefLong;

.field public static mSyncRunTimeSecs:Lmirror/RefLong;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/content/SyncRequest;

    const-class v1, Landroid/content/SyncRequest;

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/content/SyncRequest;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
