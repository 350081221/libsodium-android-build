.class public Lcom/lody/virtual/client/hook/proxies/isms/ISmsStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/com/android/internal/telephony/ISms$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "isms"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 5
    .line 6
    const-string v1, "getAllMessagesFromIccEfForSubscriber"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 16
    .line 17
    const-string v1, "updateMessageOnIccEfForSubscriber"

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 26
    .line 27
    const-string v1, "copyMessageToIccEfForSubscriber"

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 36
    .line 37
    const-string v1, "sendDataForSubscriber"

    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 46
    .line 47
    const-string v1, "sendDataForSubscriberWithSelfPermissions"

    .line 48
    .line 49
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 56
    .line 57
    const-string v1, "sendTextForSubscriber"

    .line 58
    .line 59
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 63
    .line 64
    .line 65
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 66
    .line 67
    const-string v1, "sendTextForSubscriberWithSelfPermissions"

    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 73
    .line 74
    .line 75
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 76
    .line 77
    const-string v1, "sendMultipartTextForSubscriber"

    .line 78
    .line 79
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 86
    .line 87
    const-string v1, "sendStoredText"

    .line 88
    .line 89
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 93
    .line 94
    .line 95
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;

    .line 96
    .line 97
    const-string v1, "sendStoredMultipartText"

    .line 98
    .line 99
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSpecPkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 103
    .line 104
    .line 105
    return-void
    .line 106
.end method
