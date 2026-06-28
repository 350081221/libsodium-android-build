.class public Lcom/lody/virtual/client/hook/proxies/appops/SmtOpsManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation

.annotation runtime Lcom/lody/virtual/client/hook/annotations/Inject;
    value = Lcom/lody/virtual/client/hook/proxies/appops/MethodProxies;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/com/android/internal/app/ISmtOpsService$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "smtops"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method
