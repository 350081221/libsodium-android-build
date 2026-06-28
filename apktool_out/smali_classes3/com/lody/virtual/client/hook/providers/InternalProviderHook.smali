.class public Lcom/lody/virtual/client/hook/providers/InternalProviderHook;
.super Lcom/lody/virtual/client/hook/providers/ProviderHook;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/IInterface;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/providers/ProviderHook;-><init>(Landroid/os/IInterface;)V

    return-void
.end method


# virtual methods
.method public varargs processArgs(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    array-length p1, p2

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    sget-object p1, Lmirror/android/content/AttributionSource;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {p2, p1}, Lcom/lody/virtual/client/hook/utils/MethodParameterUtils;->getIndex([Ljava/lang/Object;Ljava/lang/Class;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-gez p1, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    aget-object p1, p2, p1

    .line 23
    .line 24
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-static {p1, p2}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixAttributionSource(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
