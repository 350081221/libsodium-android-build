.class Lcom/ss/android/downloadlib/b/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/b/b;->a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/b/g;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadad/api/a/b;

.field final synthetic b:Lcom/ss/android/downloadlib/b/g;

.field final synthetic c:Lcom/ss/android/downloadlib/b/b;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/b/b;Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/b/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/b/b$1;->c:Lcom/ss/android/downloadlib/b/b;

    iput-object p2, p0, Lcom/ss/android/downloadlib/b/b$1;->a:Lcom/ss/android/downloadad/api/a/b;

    iput-object p3, p0, Lcom/ss/android/downloadlib/b/b$1;->b:Lcom/ss/android/downloadlib/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/b$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/downloadlib/b/i;->a(Lcom/ss/android/downloadad/api/a/a;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/b$1;->b:Lcom/ss/android/downloadlib/b/g;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/b/g;->a(Z)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/b$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/ss/android/downloadlib/b/f;->a(Lcom/ss/android/downloadad/api/a/b;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/b$1;->b:Lcom/ss/android/downloadlib/b/g;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/b/g;->a(Z)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/b/b$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 31
    .line 32
    new-instance v1, Lcom/ss/android/downloadlib/b/b$1$1;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/b/b$1$1;-><init>(Lcom/ss/android/downloadlib/b/b$1;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/b/f;->a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/b/h;)V

    .line 38
    .line 39
    .line 40
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
