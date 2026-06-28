.class public Lmirror/android/content/pm/SharedLibraryInfo;
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

.field public static ctor:Lmirror/RefConstructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefConstructor<",
            "Landroid/content/pm/SharedLibraryInfo;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmirror/MethodParams;
        value = {
            Ljava/lang/String;,
            Ljava/lang/String;,
            Ljava/util/List;,
            Ljava/lang/String;,
            J,
            I,
            Landroid/content/pm/VersionedPackage;,
            Ljava/util/List;,
            Ljava/util/List;,
            Z
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/content/pm/SharedLibraryInfo;

    const-string v1, "android.content.pm.SharedLibraryInfo"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/content/pm/SharedLibraryInfo;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
