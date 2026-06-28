.class Lcom/lody/virtual/server/BinderProvider$ServiceFetcher;
.super Lcom/lody/virtual/server/interfaces/IServiceFetcher$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/BinderProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ServiceFetcher"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IServiceFetcher$Stub;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/server/BinderProvider$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/lody/virtual/server/BinderProvider$ServiceFetcher;-><init>()V

    return-void
.end method


# virtual methods
.method public addService(Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, Lcom/lody/virtual/server/ServiceCache;->addService(Ljava/lang/String;Landroid/os/IBinder;)V

    :cond_0
    return-void
.end method

.method public getService(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/lody/virtual/server/ServiceCache;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public removeService(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/lody/virtual/server/ServiceCache;->removeService(Ljava/lang/String;)Landroid/os/IBinder;

    :cond_0
    return-void
.end method
