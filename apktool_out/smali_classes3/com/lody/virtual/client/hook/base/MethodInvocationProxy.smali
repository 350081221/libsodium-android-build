.class public abstract Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/client/interfaces/IInjector;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/base/MethodInvocationProxy$DirectCallMethodProxy;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/lody/virtual/client/hook/base/MethodInvocationStub;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/lody/virtual/client/interfaces/IInjector;"
    }
.end annotation


# instance fields
.field protected mInvocationStub:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->mInvocationStub:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->afterHookApply(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Lcom/lody/virtual/client/hook/annotations/LogInvocation;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/lody/virtual/client/hook/annotations/LogInvocation;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Lcom/lody/virtual/client/hook/annotations/LogInvocation;->value()Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->setInvocationLoggingCondition(Lcom/lody/virtual/client/hook/annotations/LogInvocation$Condition;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method private addMethodProxy(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 2
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    .line 3
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    if-nez v2, :cond_1

    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/client/hook/base/MethodProxy;

    goto :goto_0

    :cond_1
    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v1

    .line 6
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->mInvocationStub:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 8
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instance Hook : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " : "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->mInvocationStub:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    invoke-virtual {v0, p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    move-result-object p1

    return-object p1
.end method

.method protected afterHookApply(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->mInvocationStub:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    return-object v0
.end method

.method public abstract inject()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method

.method protected onBindMethods()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->mInvocationStub:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Lcom/lody/virtual/client/hook/annotations/Inject;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/lody/virtual/client/hook/annotations/Inject;

    .line 17
    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    invoke-interface {v0}, Lcom/lody/virtual/client/hook/annotations/Inject;->value()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    array-length v2, v1

    .line 29
    const/4 v3, 0x0

    .line 30
    move v4, v3

    .line 31
    :goto_0
    const-class v5, Lcom/lody/virtual/client/hook/annotations/SkipInject;

    .line 32
    .line 33
    if-ge v4, v2, :cond_2

    .line 34
    .line 35
    aget-object v6, v1, v4

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/Class;->getModifiers()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    const-class v7, Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 48
    .line 49
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    invoke-virtual {v6, v5}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    invoke-direct {p0, v6}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Ljava/lang/Class;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    array-length v1, v0

    .line 72
    :goto_1
    if-ge v3, v1, :cond_5

    .line 73
    .line 74
    aget-object v2, v0, v3

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-virtual {v2, v5}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-eqz v4, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    new-instance v4, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy$DirectCallMethodProxy;

    .line 95
    .line 96
    invoke-direct {v4, v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy$DirectCallMethodProxy;-><init>(Ljava/lang/reflect/Method;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v4}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 100
    .line 101
    .line 102
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    return-void
    .line 106
.end method

.method public setDefaultMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->mInvocationStub:Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    invoke-virtual {v0, p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->setDefaultMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)V

    return-void
.end method
