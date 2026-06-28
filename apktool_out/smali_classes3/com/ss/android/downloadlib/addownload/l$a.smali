.class Lcom/ss/android/downloadlib/addownload/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/downloadlib/addownload/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadlib/addownload/l;

.field private final b:Lcom/ss/android/downloadad/api/a/b;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/l;Lcom/ss/android/downloadad/api/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/l$a;->a:Lcom/ss/android/downloadlib/addownload/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/l$a;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/l$a;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Lcom/ss/android/downloadad/api/a/b;->j(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/l$a;->a:Lcom/ss/android/downloadlib/addownload/l;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/l$a;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 11
    .line 12
    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/addownload/l;->a(Lcom/ss/android/downloadlib/addownload/l;Lcom/ss/android/downloadad/api/a/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :catch_0
    move-exception v1

    .line 19
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/l$a;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/ss/android/downloadad/api/a/b;->j(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :goto_1
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/l$a;->b:Lcom/ss/android/downloadad/api/a/b;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Lcom/ss/android/downloadad/api/a/b;->j(Z)V

    .line 31
    .line 32
    .line 33
    throw v1
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
.end method
