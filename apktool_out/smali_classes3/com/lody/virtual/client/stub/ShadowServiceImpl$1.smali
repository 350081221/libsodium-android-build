.class Lcom/lody/virtual/client/stub/ShadowServiceImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/client/stub/ShadowServiceImpl$IBindServiceProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/stub/ShadowServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createProxy(Landroid/os/Binder;)Landroid/os/Binder;
    .locals 3

    new-instance v0, Lcom/lody/virtual/server/secondary/FakeIdentityBinder;

    sget v1, Lcom/lody/virtual/os/VEnvironment;->SYSTEM_UID:I

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-direct {v0, p1, v1, v2}, Lcom/lody/virtual/server/secondary/FakeIdentityBinder;-><init>(Landroid/os/Binder;II)V

    return-object v0
.end method
