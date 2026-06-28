.class Lcom/lody/virtual/server/accounts/VAccountManagerService$1;
.super Lcom/lody/virtual/helper/utils/Singleton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/accounts/VAccountManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/helper/utils/Singleton<",
        "Lcom/lody/virtual/server/accounts/VAccountManagerService;",
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
.method protected create()Lcom/lody/virtual/server/accounts/VAccountManagerService;
    .locals 1

    .line 2
    new-instance v0, Lcom/lody/virtual/server/accounts/VAccountManagerService;

    invoke-direct {v0}, Lcom/lody/virtual/server/accounts/VAccountManagerService;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic create()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/accounts/VAccountManagerService$1;->create()Lcom/lody/virtual/server/accounts/VAccountManagerService;

    move-result-object v0

    return-object v0
.end method
