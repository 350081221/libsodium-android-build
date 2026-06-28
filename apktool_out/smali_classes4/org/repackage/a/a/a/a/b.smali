.class public Lorg/repackage/a/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/repackage/a/a/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lorg/repackage/a/a/a/a/c;


# direct methods
.method public constructor <init>(Lorg/repackage/a/a/a/a/c;)V
    .locals 0

    iput-object p1, p0, Lorg/repackage/a/a/a/a/b;->a:Lorg/repackage/a/a/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lorg/repackage/a/a/a/a/b;->a:Lorg/repackage/a/a/a/a/c;

    .line 2
    .line 3
    invoke-static {p2}, Lorg/repackage/a/a/a/a$a;->a(Landroid/os/IBinder;)Lorg/repackage/a/a/a/a;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iput-object p2, p1, Lorg/repackage/a/a/a/a/c;->a:Lorg/repackage/a/a/a/a;

    .line 8
    .line 9
    iget-object p1, p0, Lorg/repackage/a/a/a/a/b;->a:Lorg/repackage/a/a/a/a/c;

    .line 10
    .line 11
    iget-object p1, p1, Lorg/repackage/a/a/a/a/c;->d:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    iget-object p2, p0, Lorg/repackage/a/a/a/a/b;->a:Lorg/repackage/a/a/a/a/c;

    .line 15
    .line 16
    iget-object p2, p2, Lorg/repackage/a/a/a/a/c;->d:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->notify()V

    .line 19
    .line 20
    .line 21
    monitor-exit p1

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p2

    .line 24
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p2
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
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lorg/repackage/a/a/a/a/b;->a:Lorg/repackage/a/a/a/a/c;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p1, Lorg/repackage/a/a/a/a/c;->a:Lorg/repackage/a/a/a/a;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method
