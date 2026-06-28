.class public Lmirror/android/app/usage/StorageStats;
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

.field public static cacheBytes:Lmirror/RefLong;

.field public static codeBytes:Lmirror/RefLong;

.field public static ctor:Lmirror/RefConstructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefConstructor<",
            "Landroid/app/usage/StorageStats;",
            ">;"
        }
    .end annotation
.end field

.field public static dataBytes:Lmirror/RefLong;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/app/usage/StorageStats;

    const-string v1, "android.app.usage.StorageStats"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/app/usage/StorageStats;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
