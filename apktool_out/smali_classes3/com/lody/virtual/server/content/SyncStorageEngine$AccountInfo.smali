.class Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncStorageEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AccountInfo"
.end annotation


# instance fields
.field final accountAndUser:Lcom/lody/virtual/server/accounts/AccountAndUser;

.field final authorities:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/accounts/AccountAndUser;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->accountAndUser:Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
