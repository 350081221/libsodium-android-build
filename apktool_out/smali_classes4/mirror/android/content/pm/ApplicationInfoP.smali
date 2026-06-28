.class public Lmirror/android/content/pm/ApplicationInfoP;
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

.field public static sharedLibraryInfos:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lmirror/MethodParams;
        value = {
            I
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/content/pm/ApplicationInfoP;

    const-class v1, Landroid/content/pm/ApplicationInfo;

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/content/pm/ApplicationInfoP;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static sharedLibraryInfos(Landroid/content/pm/ApplicationInfo;)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/content/pm/ApplicationInfoP;->sharedLibraryInfos:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static sharedLibraryInfos(Landroid/content/pm/ApplicationInfo;Ljava/util/List;)V
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/content/pm/ApplicationInfoP;->sharedLibraryInfos:Lmirror/RefObject;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
