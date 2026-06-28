.class public Lcom/lody/virtual/server/pm/AppChangedCallbackList;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sInstance:Lcom/lody/virtual/server/pm/AppChangedCallbackList;


# instance fields
.field private mList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/pm/IAppChangedCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/pm/AppChangedCallbackList;

    invoke-direct {v0}, Lcom/lody/virtual/server/pm/AppChangedCallbackList;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/pm/AppChangedCallbackList;->sInstance:Lcom/lody/virtual/server/pm/AppChangedCallbackList;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/lody/virtual/server/pm/AppChangedCallbackList;->mList:Ljava/util/List;

    .line 11
    .line 12
    return-void
    .line 13
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
.end method

.method public static get()Lcom/lody/virtual/server/pm/AppChangedCallbackList;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/pm/AppChangedCallbackList;->sInstance:Lcom/lody/virtual/server/pm/AppChangedCallbackList;

    return-object v0
.end method


# virtual methods
.method notifyCallbacks(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/AppChangedCallbackList;->mList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/lody/virtual/server/pm/IAppChangedCallback;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lcom/lody/virtual/server/pm/IAppChangedCallback;->onCallback(Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public register(Lcom/lody/virtual/server/pm/IAppChangedCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/AppChangedCallbackList;->mList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public unregister(Lcom/lody/virtual/server/pm/IAppChangedCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/AppChangedCallbackList;->mList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
