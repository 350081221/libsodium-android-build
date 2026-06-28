.class public Lcom/ss/android/downloadlib/g/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/g/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/ss/android/downloadlib/g/c$a<",
            "TP;TR;>;>;"
        }
    .end annotation
.end field

.field private e:Lcom/ss/android/downloadlib/g/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ss/android/downloadlib/g/c<",
            "*TP;>;"
        }
    .end annotation
.end field

.field private f:Lcom/ss/android/downloadlib/g/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ss/android/downloadlib/g/c<",
            "TR;*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILcom/ss/android/downloadlib/g/c$a;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ss/android/downloadlib/g/c$a<",
            "TP;TR;>;TP;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/ss/android/downloadlib/g/c;->c:I

    .line 5
    .line 6
    new-instance p1, Ljava/lang/ref/SoftReference;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/ss/android/downloadlib/g/c;->d:Ljava/lang/ref/SoftReference;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/ss/android/downloadlib/g/c;->a:Ljava/lang/Object;

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

.method public static a(Lcom/ss/android/downloadlib/g/c$a;Ljava/lang/Object;)Lcom/ss/android/downloadlib/g/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ss/android/downloadlib/g/c$a<",
            "TP;TR;>;TP;)",
            "Lcom/ss/android/downloadlib/g/c<",
            "TP;TR;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/g/c;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lcom/ss/android/downloadlib/g/c;-><init>(ILcom/ss/android/downloadlib/g/c$a;Ljava/lang/Object;)V

    return-object v0
.end method

.method private b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/downloadlib/g/c;->b:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public a(ILcom/ss/android/downloadlib/g/c$a;)Lcom/ss/android/downloadlib/g/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<NR:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/ss/android/downloadlib/g/c$a<",
            "TR;TNR;>;)",
            "Lcom/ss/android/downloadlib/g/c<",
            "TR;TNR;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/g/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/ss/android/downloadlib/g/c;-><init>(ILcom/ss/android/downloadlib/g/c$a;Ljava/lang/Object;)V

    .line 3
    iput-object v0, p0, Lcom/ss/android/downloadlib/g/c;->f:Lcom/ss/android/downloadlib/g/c;

    .line 4
    iput-object p0, v0, Lcom/ss/android/downloadlib/g/c;->e:Lcom/ss/android/downloadlib/g/c;

    return-object v0
.end method

.method public a(Lcom/ss/android/downloadlib/g/c$a;)Lcom/ss/android/downloadlib/g/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<NR:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ss/android/downloadlib/g/c$a<",
            "TR;TNR;>;)",
            "Lcom/ss/android/downloadlib/g/c<",
            "TR;TNR;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/downloadlib/g/c;->a(ILcom/ss/android/downloadlib/g/c$a;)Lcom/ss/android/downloadlib/g/c;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadlib/g/c;->e:Lcom/ss/android/downloadlib/g/c;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/g/c;->a()V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/g/c;->run()V

    :goto_0
    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/downloadlib/g/c;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/g/m;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/g;->b()Landroid/os/Handler;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget v0, p0, Lcom/ss/android/downloadlib/g/c;->c:I

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lcom/ss/android/downloadlib/g/m;->b()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-static {}, Lcom/ss/android/downloadlib/d;->a()Lcom/ss/android/downloadlib/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/d;->a(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget v0, p0, Lcom/ss/android/downloadlib/g/c;->c:I

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    invoke-static {}, Lcom/ss/android/downloadlib/g/m;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-static {}, Lcom/ss/android/downloadlib/d;->a()Lcom/ss/android/downloadlib/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/d;->b(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/g/c;->a:Ljava/lang/Object;

    .line 62
    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    iget-object v0, p0, Lcom/ss/android/downloadlib/g/c;->e:Lcom/ss/android/downloadlib/g/c;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-direct {v0}, Lcom/ss/android/downloadlib/g/c;->b()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/ss/android/downloadlib/g/c;->a:Ljava/lang/Object;

    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lcom/ss/android/downloadlib/g/c;->d:Ljava/lang/ref/SoftReference;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/ss/android/downloadlib/g/c$a;

    .line 82
    .line 83
    if-nez v0, :cond_4

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    iget-object v1, p0, Lcom/ss/android/downloadlib/g/c;->a:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/g/c$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/ss/android/downloadlib/g/c;->b:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object v0, p0, Lcom/ss/android/downloadlib/g/c;->f:Lcom/ss/android/downloadlib/g/c;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/ss/android/downloadlib/g/c;->run()V

    .line 99
    .line 100
    .line 101
    :cond_5
    return-void
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
