.class public Lcom/swift/sandhook/SandHook;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swift/sandhook/SandHook$HookResultCallBack;,
        Lcom/swift/sandhook/SandHook$HookModeCallBack;
    }
.end annotation


# static fields
.field public static artMethodClass:Ljava/lang/Class;

.field static globalBackupMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;",
            ">;"
        }
    .end annotation
.end field

.field static globalHookEntityMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Member;",
            "Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;",
            ">;"
        }
    .end annotation
.end field

.field private static hookModeCallBack:Lcom/swift/sandhook/SandHook$HookModeCallBack;

.field private static hookResultCallBack:Lcom/swift/sandhook/SandHook$HookResultCallBack;

.field public static nativePeerField:Ljava/lang/reflect/Field;

.field public static testAccessFlag:I

.field public static testOffsetArtMethod1:Ljava/lang/Object;

.field public static testOffsetArtMethod2:Ljava/lang/Object;

.field public static testOffsetMethod1:Ljava/lang/reflect/Method;

.field public static testOffsetMethod2:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/swift/sandhook/SandHook;->globalHookEntityMap:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/swift/sandhook/SandHook;->globalBackupMap:Ljava/util/Map;

    .line 14
    .line 15
    invoke-static {}, Lcom/swift/sandhook/SandHook;->init()Z

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native MakeInitializedClassVisibilyInitialized(J)V
.end method

.method public static varargs addHookClass(Ljava/lang/ClassLoader;[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/swift/sandhook/wrapper/HookErrorException;
        }
    .end annotation

    .line 2
    invoke-static {p0, p1}, Lcom/swift/sandhook/wrapper/HookWrapper;->addHookClass(Ljava/lang/ClassLoader;[Ljava/lang/Class;)V

    return-void
.end method

.method public static varargs addHookClass([Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/swift/sandhook/wrapper/HookErrorException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/swift/sandhook/wrapper/HookWrapper;->addHookClass([Ljava/lang/Class;)V

    return-void
.end method

.method public static native addPendingHookNative(Ljava/lang/reflect/Member;)V
.end method

.method public static final varargs callOriginByBackup(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/swift/sandhook/SandHook;->globalBackupMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-boolean v1, v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->backupIsStub:Z

    .line 14
    .line 15
    iget-object v0, v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 16
    .line 17
    invoke-static {v1, v0, p0, p1, p2}, Lcom/swift/sandhook/SandHook;->callOriginMethod(ZLjava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public static final varargs callOriginMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/swift/sandhook/SandHook;->globalHookEntityMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->backup:Ljava/lang/reflect/Method;

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-boolean v0, v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->backupIsStub:Z

    invoke-static {v0, p0, v1, p1, p2}, Lcom/swift/sandhook/SandHook;->callOriginMethod(ZLjava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final callOriginMethod(Ljava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    .line 4
    invoke-static {v0, p0, p1, p2, p3}, Lcom/swift/sandhook/SandHook;->callOriginMethod(ZLjava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final callOriginMethod(ZLjava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    if-nez p0, :cond_0

    .line 5
    sget p0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p0, v0, :cond_0

    .line 6
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    invoke-static {p1, p2}, Lcom/swift/sandhook/SandHook;->ensureDeclareClass(Ljava/lang/reflect/Member;Ljava/lang/reflect/Method;)V

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p2, p0, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    .line 12
    :cond_1
    throw p0

    .line 13
    :cond_2
    :try_start_1
    invoke-virtual {p2, p3, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    .line 16
    :cond_3
    throw p0
.end method

.method public static native canGetObject()Z
.end method

.method public static canGetObjectAddress()Z
    .locals 1

    invoke-static {}, Lcom/swift/sandhook/utils/Unsafe;->support()Z

    move-result v0

    return v0
.end method

.method public static native compileMethod(Ljava/lang/reflect/Member;)Z
.end method

.method public static native deCompileMethod(Ljava/lang/reflect/Member;Z)Z
.end method

.method public static native disableDex2oatInline(Z)Z
.end method

.method public static native disableVMInline()Z
.end method

.method public static final ensureBackupMethod(Ljava/lang/reflect/Method;)V
    .locals 2

    .line 1
    sget v0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Lcom/swift/sandhook/SandHook;->globalBackupMap:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 19
    .line 20
    invoke-static {v0, p0}, Lcom/swift/sandhook/SandHook;->ensureDeclareClass(Ljava/lang/reflect/Member;Ljava/lang/reflect/Method;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static native ensureDeclareClass(Ljava/lang/reflect/Member;Ljava/lang/reflect/Method;)V
.end method

.method public static native ensureMethodCached(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
.end method

.method public static getArtMethod(Ljava/lang/reflect/Member;)J
    .locals 2

    invoke-static {p0}, Lcom/swift/sandhook/SandHookMethodResolver;->getArtMethod(Ljava/lang/reflect/Member;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static getFakeArgs(Ljava/lang/reflect/Method;)[Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    array-length p0, p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 14
    new-array p0, p0, [Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    aput-object v0, p0, v1

    .line 23
    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
.end method

.method public static getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public static getJavaMethod(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_1
    new-array v1, v1, [Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    return-object v0
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.end method

.method public static getObject(J)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {}, Lcom/swift/sandhook/SandHook;->getThreadId()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1, p0, p1}, Lcom/swift/sandhook/SandHook;->getObjectNative(JJ)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method public static getObjectAddress(Ljava/lang/Object;)J
    .locals 2

    invoke-static {p0}, Lcom/swift/sandhook/utils/Unsafe;->getObjectAddress(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static native getObjectNative(JJ)Ljava/lang/Object;
.end method

.method public static getThreadId()J
    .locals 4

    .line 1
    sget-object v0, Lcom/swift/sandhook/SandHook;->nativePeerField:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    if-ne v0, v3, :cond_1

    .line 15
    .line 16
    sget-object v0, Lcom/swift/sandhook/SandHook;->nativePeerField:Ljava/lang/reflect/Field;

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-long v0, v0

    .line 27
    return-wide v0

    .line 28
    :cond_1
    sget-object v0, Lcom/swift/sandhook/SandHook;->nativePeerField:Ljava/lang/reflect/Field;

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-wide v0

    .line 39
    :catch_0
    return-wide v1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public static hasJavaArtMethod()Z
    .locals 4

    .line 1
    sget v0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    sget-object v0, Lcom/swift/sandhook/SandHook;->artMethodClass:Ljava/lang/Class;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    :try_start_0
    sget-object v0, Lcom/swift/sandhook/SandHookConfig;->initClassLoader:Ljava/lang/ClassLoader;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    const-string v3, "java.lang.reflect.ArtMethod"

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    :try_start_1
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/swift/sandhook/SandHook;->artMethodClass:Ljava/lang/Class;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    sget-object v0, Lcom/swift/sandhook/SandHookConfig;->initClassLoader:Ljava/lang/ClassLoader;

    .line 29
    .line 30
    invoke-static {v3, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lcom/swift/sandhook/SandHook;->artMethodClass:Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 35
    .line 36
    :goto_0
    return v1

    .line 37
    :catch_0
    return v2
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public static declared-synchronized hook(Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/swift/sandhook/wrapper/HookErrorException;
        }
    .end annotation

    .line 1
    const-class v0, Lcom/swift/sandhook/SandHook;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_10

    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->hook:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->backup:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    if-eqz v1, :cond_f

    .line 13
    .line 14
    if-eqz v2, :cond_f

    .line 15
    .line 16
    sget-object v4, Lcom/swift/sandhook/SandHook;->globalHookEntityMap:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v4, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_e

    .line 23
    .line 24
    invoke-static {v1}, Lcom/swift/sandhook/blacklist/HookBlackList;->canNotHook(Ljava/lang/reflect/Member;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_d

    .line 29
    .line 30
    sget-boolean v4, Lcom/swift/sandhook/SandHookConfig;->delayHook:Z

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-static {}, Lcom/swift/sandhook/PendingHookHandler;->canWork()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iget-object v4, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 41
    .line 42
    invoke-static {v4}, Lcom/swift/sandhook/utils/ClassStatusUtils;->isStaticAndNoInited(Ljava/lang/reflect/Member;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    invoke-static {p0}, Lcom/swift/sandhook/PendingHookHandler;->addPendingHook(Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :cond_0
    :try_start_1
    iget-boolean v4, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->initClass:Z

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    invoke-static {v1}, Lcom/swift/sandhook/SandHook;->resolveStaticMethod(Ljava/lang/reflect/Member;)Z

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lcom/swift/sandhook/SandHook;->getThreadId()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    invoke-static {v4, v5}, Lcom/swift/sandhook/SandHook;->MakeInitializedClassVisibilyInitialized(J)V

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-static {v3}, Lcom/swift/sandhook/SandHook;->resolveStaticMethod(Ljava/lang/reflect/Member;)Z

    .line 68
    .line 69
    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    iget-boolean v4, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->resolveDexCache:Z

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    invoke-static {v2, v3}, Lcom/swift/sandhook/SandHookMethodResolver;->resolveMethod(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    instance-of v4, v1, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    const/4 v5, 0x1

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    move-object v4, v1

    .line 85
    check-cast v4, Ljava/lang/reflect/Method;

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 88
    .line 89
    .line 90
    :cond_3
    sget-object v4, Lcom/swift/sandhook/SandHook;->hookModeCallBack:Lcom/swift/sandhook/SandHook$HookModeCallBack;

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    if-eqz v4, :cond_4

    .line 94
    .line 95
    invoke-interface {v4, v1}, Lcom/swift/sandhook/SandHook$HookModeCallBack;->hookMode(Ljava/lang/reflect/Member;)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    move v4, v6

    .line 101
    :goto_0
    sget-object v7, Lcom/swift/sandhook/SandHook;->globalHookEntityMap:Ljava/util/Map;

    .line 102
    .line 103
    iget-object v8, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 104
    .line 105
    invoke-interface {v7, v8, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    invoke-static {v1, v2, v3, v4}, Lcom/swift/sandhook/SandHook;->hookMethod(Ljava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;I)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    goto :goto_2

    .line 115
    :cond_5
    const-class v4, Lcom/swift/sandhook/annotation/HookMode;

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Lcom/swift/sandhook/annotation/HookMode;

    .line 122
    .line 123
    if-nez v4, :cond_6

    .line 124
    .line 125
    move v4, v6

    .line 126
    goto :goto_1

    .line 127
    :cond_6
    invoke-interface {v4}, Lcom/swift/sandhook/annotation/HookMode;->value()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    :goto_1
    invoke-static {v1, v2, v3, v4}, Lcom/swift/sandhook/SandHook;->hookMethod(Ljava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;I)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    :goto_2
    if-lez v1, :cond_7

    .line 136
    .line 137
    if-eqz v3, :cond_7

    .line 138
    .line 139
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 140
    .line 141
    .line 142
    :cond_7
    iput v1, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->hookMode:I

    .line 143
    .line 144
    sget-object v2, Lcom/swift/sandhook/SandHook;->hookResultCallBack:Lcom/swift/sandhook/SandHook$HookResultCallBack;

    .line 145
    .line 146
    if-eqz v2, :cond_9

    .line 147
    .line 148
    if-lez v1, :cond_8

    .line 149
    .line 150
    move v6, v5

    .line 151
    :cond_8
    invoke-interface {v2, v6, p0}, Lcom/swift/sandhook/SandHook$HookResultCallBack;->hookResult(ZLcom/swift/sandhook/wrapper/HookWrapper$HookEntity;)V

    .line 152
    .line 153
    .line 154
    :cond_9
    if-ltz v1, :cond_c

    .line 155
    .line 156
    iget-object v2, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->backup:Ljava/lang/reflect/Method;

    .line 157
    .line 158
    if-eqz v2, :cond_a

    .line 159
    .line 160
    sget-object v3, Lcom/swift/sandhook/SandHook;->globalBackupMap:Ljava/util/Map;

    .line 161
    .line 162
    invoke-interface {v3, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v3, "method <"

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget-object p0, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p0, "> hook <"

    .line 185
    .line 186
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    if-ne v1, v5, :cond_b

    .line 190
    .line 191
    const-string p0, "inline"

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_b
    const-string p0, "replacement"

    .line 195
    .line 196
    :goto_3
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string p0, "> success!"

    .line 200
    .line 201
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {p0}, Lcom/swift/sandhook/HookLog;->d(Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    .line 210
    .line 211
    monitor-exit v0

    .line 212
    return-void

    .line 213
    :cond_c
    :try_start_2
    sget-object v1, Lcom/swift/sandhook/SandHook;->globalHookEntityMap:Ljava/util/Map;

    .line 214
    .line 215
    iget-object v2, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 216
    .line 217
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    new-instance v1, Lcom/swift/sandhook/wrapper/HookErrorException;

    .line 221
    .line 222
    new-instance v2, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    const-string v3, "hook method <"

    .line 228
    .line 229
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    iget-object p0, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string p0, "> error in native!"

    .line 242
    .line 243
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-direct {v1, p0}, Lcom/swift/sandhook/wrapper/HookErrorException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v1

    .line 254
    :cond_d
    new-instance v1, Lcom/swift/sandhook/wrapper/HookErrorException;

    .line 255
    .line 256
    new-instance v2, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v3, "method <"

    .line 262
    .line 263
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    iget-object p0, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string p0, "> can not hook, because of in blacklist!"

    .line 276
    .line 277
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-direct {v1, p0}, Lcom/swift/sandhook/wrapper/HookErrorException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v1

    .line 288
    :cond_e
    new-instance v1, Lcom/swift/sandhook/wrapper/HookErrorException;

    .line 289
    .line 290
    new-instance v2, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const-string v3, "method <"

    .line 296
    .line 297
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    iget-object p0, p0, Lcom/swift/sandhook/wrapper/HookWrapper$HookEntity;->target:Ljava/lang/reflect/Member;

    .line 301
    .line 302
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    const-string p0, "> has been hooked!"

    .line 310
    .line 311
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-direct {v1, p0}, Lcom/swift/sandhook/wrapper/HookErrorException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v1

    .line 322
    :cond_f
    new-instance p0, Lcom/swift/sandhook/wrapper/HookErrorException;

    .line 323
    .line 324
    const-string v1, "null input"

    .line 325
    .line 326
    invoke-direct {p0, v1}, Lcom/swift/sandhook/wrapper/HookErrorException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw p0

    .line 330
    :catchall_0
    move-exception p0

    .line 331
    goto :goto_4

    .line 332
    :cond_10
    new-instance p0, Lcom/swift/sandhook/wrapper/HookErrorException;

    .line 333
    .line 334
    const-string v1, "null hook entity"

    .line 335
    .line 336
    invoke-direct {p0, v1}, Lcom/swift/sandhook/wrapper/HookErrorException;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 340
    :goto_4
    monitor-exit v0

    .line 341
    throw p0
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method private static native hookMethod(Ljava/lang/reflect/Member;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;I)I
.end method

.method private static init()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/swift/sandhook/SandHook;->initTestOffset()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/swift/sandhook/SandHook;->initThreadPeer()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/swift/sandhook/SandHookMethodResolver;->init()V

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 11
    .line 12
    sget-boolean v1, Lcom/swift/sandhook/SandHookConfig;->DEBUG:Z

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/swift/sandhook/SandHook;->initNative(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static native initForPendingHook()Z
.end method

.method private static native initNative(IZ)Z
.end method

.method private static initTestAccessFlag()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/swift/sandhook/SandHook;->hasJavaArtMethod()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "accessFlags"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {}, Lcom/swift/sandhook/SandHook;->loadArtMethod()V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/swift/sandhook/SandHook;->artMethodClass:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/swift/sandhook/SandHook;->getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lcom/swift/sandhook/SandHook;->testOffsetArtMethod1:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sput v0, Lcom/swift/sandhook/SandHook;->testAccessFlag:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-class v0, Ljava/lang/reflect/Method;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/swift/sandhook/SandHook;->getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, Lcom/swift/sandhook/SandHook;->testOffsetMethod1:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sput v0, Lcom/swift/sandhook/SandHook;->testAccessFlag:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    :catch_0
    :goto_0
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private static initTestOffset()V
    .locals 4

    .line 1
    const-class v0, Lcom/swift/sandhook/ArtMethodSizeTest;

    .line 2
    .line 3
    invoke-static {}, Lcom/swift/sandhook/ArtMethodSizeTest;->method1()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/swift/sandhook/ArtMethodSizeTest;->method2()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    const-string v1, "method1"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    new-array v3, v2, [Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lcom/swift/sandhook/SandHook;->testOffsetMethod1:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    const-string v1, "method2"

    .line 21
    .line 22
    new-array v2, v2, [Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/swift/sandhook/SandHook;->testOffsetMethod2:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    invoke-static {}, Lcom/swift/sandhook/SandHook;->initTestAccessFlag()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception v0

    .line 35
    new-instance v1, Ljava/lang/RuntimeException;

    .line 36
    .line 37
    const-string v2, "SandHook init error"

    .line 38
    .line 39
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private static initThreadPeer()V
    .locals 2

    :try_start_0
    const-class v0, Ljava/lang/Thread;

    const-string v1, "nativePeer"

    invoke-static {v0, v1}, Lcom/swift/sandhook/SandHook;->getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lcom/swift/sandhook/SandHook;->nativePeerField:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static native is64Bit()Z
.end method

.method private static loadArtMethod()V
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const-string v1, "artMethod"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/swift/sandhook/SandHook;->getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/swift/sandhook/SandHook;->testOffsetMethod1:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, Lcom/swift/sandhook/SandHook;->testOffsetArtMethod1:Ljava/lang/Object;

    .line 16
    .line 17
    sget-object v1, Lcom/swift/sandhook/SandHook;->testOffsetMethod2:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/swift/sandhook/SandHook;->testOffsetArtMethod2:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_1
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public static passApiCheck()Z
    .locals 1

    invoke-static {}, Lcom/swift/sandhook/utils/ReflectionUtils;->passApiCheck()Z

    move-result v0

    return v0
.end method

.method public static resolveStaticMethod(Ljava/lang/reflect/Member;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    instance-of v1, p0, Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    check-cast v1, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    move-object v1, p0

    .line 26
    check-cast v1, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/Object;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    check-cast p0, Ljava/lang/reflect/Method;

    .line 34
    .line 35
    invoke-static {p0}, Lcom/swift/sandhook/SandHook;->getFakeArgs(Ljava/lang/reflect/Method;)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v1, v2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :catchall_0
    :cond_1
    return v0

    .line 43
    :catch_0
    const/4 p0, 0x0

    .line 44
    return p0
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

.method public static native setHookMode(I)V
.end method

.method public static setHookModeCallBack(Lcom/swift/sandhook/SandHook$HookModeCallBack;)V
    .locals 0

    sput-object p0, Lcom/swift/sandhook/SandHook;->hookModeCallBack:Lcom/swift/sandhook/SandHook$HookModeCallBack;

    return-void
.end method

.method public static setHookResultCallBack(Lcom/swift/sandhook/SandHook$HookResultCallBack;)V
    .locals 0

    sput-object p0, Lcom/swift/sandhook/SandHook;->hookResultCallBack:Lcom/swift/sandhook/SandHook$HookResultCallBack;

    return-void
.end method

.method public static native setInlineSafeCheck(Z)V
.end method

.method public static native setNativeEntry(Ljava/lang/reflect/Member;Ljava/lang/reflect/Member;J)Z
.end method

.method public static native skipAllSafeCheck(Z)V
.end method

.method public static tryDisableProfile(Ljava/lang/String;)Z
    .locals 4

    .line 1
    sget v0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "/data/misc/profiles/cur/"

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    sget v3, Lcom/swift/sandhook/SandHookConfig;->curUser:I

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, "/"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, "/primary.prof"

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 51
    .line 52
    .line 53
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    return v2

    .line 57
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :catchall_0
    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/16 v0, 0x100

    .line 68
    .line 69
    invoke-static {p0, v0}, Lcom/swift/sandhook/utils/FileUtils;->chmod(Ljava/lang/String;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :catchall_1
    return v2
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
