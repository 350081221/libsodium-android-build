.class Lcom/ss/android/downloadlib/h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/c/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/h;->a(Lcom/ss/android/downloadad/api/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadad/api/a/b;

.field final synthetic b:Lcom/ss/android/downloadlib/h;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/h;Lcom/ss/android/downloadad/api/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/h$2;->b:Lcom/ss/android/downloadlib/h;

    iput-object p2, p0, Lcom/ss/android/downloadlib/h$2;->a:Lcom/ss/android/downloadad/api/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/g/l;->a()Lcom/ss/android/downloadlib/g/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/h;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "checkMarketInstallFinishEventForReboot"

    .line 10
    .line 11
    const-string v3, "\u8fdb\u7a0b\u88ab\u6740,\u91cd\u65b0\u6ce8\u518c\u5e7f\u64ad\u76d1\u542c\u6210\u529f,\u6b63\u5f0f\u6267\u884c\u51b7\u542f\u515c\u5e95\u903b\u8f91"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/g/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/ss/android/downloadlib/h$2;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/ss/android/downloadad/api/a/b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/ss/android/downloadlib/h$2;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public b()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/g/l;->a()Lcom/ss/android/downloadlib/g/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/h;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "\u515c\u5e95\u76d1\u542c\u6267\u884c\u5b8c\u6bd5,\u89e3\u9664\u5e7f\u64ad\u76d1\u542c"

    .line 10
    .line 11
    const-string v3, "checkMarketInstallFinishEventForReboot"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v3, v2}, Lcom/ss/android/downloadlib/g/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/ss/android/downloadlib/h$2;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/ss/android/downloadlib/g/m;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/g/l;->a()Lcom/ss/android/downloadlib/g/l;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {}, Lcom/ss/android/downloadlib/h;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "\u76d1\u542c\u7ed3\u675f\u4f9d\u7136\u6ca1\u6709\u5b8c\u6210\u5b89\u88c5"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v3, v2}, Lcom/ss/android/downloadlib/g/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/h$2;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/ss/android/downloadad/api/a/b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/ss/android/downloadlib/h$2;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadad/api/a/b;->j(Z)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v1, p0, Lcom/ss/android/downloadlib/h$2;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 58
    .line 59
    .line 60
    return-void
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
