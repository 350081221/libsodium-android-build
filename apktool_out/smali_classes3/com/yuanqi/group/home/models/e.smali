.class public Lcom/yuanqi/group/home/models/e;
.super Lcom/yuanqi/group/home/models/j;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/lody/virtual/remote/InstalledAppInfo;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/yuanqi/group/home/models/j;-><init>(Landroid/content/Context;Lcom/lody/virtual/remote/InstalledAppInfo;I)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 2

    invoke-static {}, Lcom/lody/virtual/client/ipc/VDeviceManager;->get()Lcom/lody/virtual/client/ipc/VDeviceManager;

    move-result-object v0

    iget v1, p0, Lcom/yuanqi/group/home/models/j;->b:I

    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/ipc/VDeviceManager;->isEnable(I)Z

    move-result v0

    return v0
.end method
