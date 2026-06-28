.class Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$1;
.super Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub$1;->this$0:Lcom/lody/virtual/client/hook/proxies/shortcut/ShortcutServiceStub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lcom/lody/virtual/helper/compat/ParceledListSliceCompat;->create(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
