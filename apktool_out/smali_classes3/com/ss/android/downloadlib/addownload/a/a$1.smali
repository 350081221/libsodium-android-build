.class Lcom/ss/android/downloadlib/addownload/a/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/download/api/model/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/a/a;->a(Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/b/a;Lcom/ss/android/downloadlib/addownload/a/a$a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadad/api/a/b;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/ss/android/downloadlib/addownload/b/a;

.field final synthetic d:Lcom/ss/android/downloadlib/addownload/a/a$a;

.field final synthetic e:Lcom/ss/android/downloadlib/addownload/a/a;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/a/a;Lcom/ss/android/downloadad/api/a/b;Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/b/a;Lcom/ss/android/downloadlib/addownload/a/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->e:Lcom/ss/android/downloadlib/addownload/a/a;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->a:Lcom/ss/android/downloadad/api/a/b;

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->b:Landroid/content/Context;

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->c:Lcom/ss/android/downloadlib/addownload/b/a;

    iput-object p5, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->d:Lcom/ss/android/downloadlib/addownload/a/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "backdialog_install"

    .line 6
    .line 7
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->b:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->c:Lcom/ss/android/downloadlib/addownload/b/a;

    .line 15
    .line 16
    iget-wide v1, v1, Lcom/ss/android/downloadlib/addownload/b/a;->a:J

    .line 17
    .line 18
    long-to-int v1, v1

    .line 19
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;I)Z

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method

.method public b(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "backdialog_exit"

    .line 6
    .line 7
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->b(Ljava/lang/String;Lcom/ss/android/downloadad/api/a/a;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->d:Lcom/ss/android/downloadlib/addownload/a/a$a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/a/a$a;->a()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->e:Lcom/ss/android/downloadlib/addownload/a/a;

    .line 20
    .line 21
    const-string v1, ""

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/a/a;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method public c(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/a/a$1;->e:Lcom/ss/android/downloadlib/addownload/a/a;

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/a/a;->b(Ljava/lang/String;)V

    return-void
.end method
