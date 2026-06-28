.class Lcom/lody/virtual/server/pm/VPackageManagerService$2;
.super Lcom/lody/virtual/helper/utils/Singleton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/pm/VPackageManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/helper/utils/Singleton<",
        "Lcom/lody/virtual/server/pm/VPackageManagerService;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/utils/Singleton;-><init>()V

    return-void
.end method


# virtual methods
.method protected create()Lcom/lody/virtual/server/pm/VPackageManagerService;
    .locals 2

    .line 2
    new-instance v0, Lcom/lody/virtual/server/pm/VPackageManagerService;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lody/virtual/server/pm/VPackageManagerService;-><init>(Lcom/lody/virtual/server/pm/VPackageManagerService$1;)V

    return-object v0
.end method

.method protected bridge synthetic create()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/pm/VPackageManagerService$2;->create()Lcom/lody/virtual/server/pm/VPackageManagerService;

    move-result-object v0

    return-object v0
.end method
