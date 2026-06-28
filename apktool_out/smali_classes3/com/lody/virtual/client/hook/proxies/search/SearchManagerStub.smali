.class public Lcom/lody/virtual/client/hook/proxies/search/SearchManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/search/SearchManagerStub$GetSearchableInfo;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/app/ISearchManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "search"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;

    .line 5
    .line 6
    const-string v1, "launchLegacyAssist"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/search/SearchManagerStub$GetSearchableInfo;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/search/SearchManagerStub$GetSearchableInfo;-><init>(Lcom/lody/virtual/client/hook/proxies/search/SearchManagerStub$1;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 21
    .line 22
    .line 23
    return-void
.end method
