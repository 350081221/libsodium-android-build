.class final Landroidx/compose/ui/platform/InputMethodSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/platform/InputMethodSession;",
        "",
        "Landroid/view/inputmethod/EditorInfo;",
        "outAttrs",
        "Landroid/view/inputmethod/InputConnection;",
        "createInputConnection",
        "Lkotlin/r2;",
        "dispose",
        "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;",
        "request",
        "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;",
        "Lkotlin/Function0;",
        "onConnectionClosed",
        "Lv3/a;",
        "lock",
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;",
        "connection",
        "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;",
        "",
        "disposed",
        "Z",
        "isActive",
        "()Z",
        "<init>",
        "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lv3/a;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,157:1\n35#2:158\n35#2:159\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n129#1:158\n149#1:159\n*E\n"
    }
.end annotation


# instance fields
.field private connection:Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private disposed:Z

.field private final lock:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onConnectionClosed:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final request:Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lv3/a;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/InputMethodSession;->request:Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/platform/InputMethodSession;->onConnectionClosed:Lv3/a;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/compose/ui/platform/InputMethodSession;->lock:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
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
.end method


# virtual methods
.method public final createInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/InputMethodSession;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/compose/ui/platform/InputMethodSession;->disposed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    :try_start_1
    iget-object v1, p0, Landroidx/compose/ui/platform/InputMethodSession;->connection:Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;->disposeDelegate()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/platform/InputMethodSession;->request:Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;

    .line 19
    .line 20
    invoke-interface {v1, p1}, Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;->createInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v1, p0, Landroidx/compose/ui/platform/InputMethodSession;->onConnectionClosed:Lv3/a;

    .line 25
    .line 26
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapper_androidKt;->NullableInputConnectionWrapper(Landroid/view/inputmethod/InputConnection;Lv3/a;)Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Landroidx/compose/ui/platform/InputMethodSession;->connection:Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-object p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit v0

    .line 36
    throw p1
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

.method public final dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/InputMethodSession;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Landroidx/compose/ui/platform/InputMethodSession;->disposed:Z

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/compose/ui/platform/InputMethodSession;->connection:Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;->disposeDelegate()V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Landroidx/compose/ui/platform/InputMethodSession;->connection:Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;

    .line 16
    .line 17
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0

    .line 23
    throw v1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final isActive()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/InputMethodSession;->disposed:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
