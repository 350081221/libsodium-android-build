.class public Lm0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/a;->h(Ly0/a;Landroid/content/Context;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly0/a;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Z

.field public final synthetic d:I

.field public final synthetic e:Lm0/a;


# direct methods
.method public constructor <init>(Lm0/a;Ly0/a;Landroid/content/Context;ZI)V
    .locals 0

    iput-object p1, p0, Lm0/a$a;->e:Lm0/a;

    iput-object p2, p0, Lm0/a$a;->a:Ly0/a;

    iput-object p3, p0, Lm0/a$a;->b:Landroid/content/Context;

    iput-boolean p4, p0, Lm0/a$a;->c:Z

    iput p5, p0, Lm0/a$a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lu0/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lu0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lm0/a$a;->a:Ly0/a;

    .line 7
    .line 8
    iget-object v2, p0, Lm0/a$a;->b:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ls0/e;->h(Ly0/a;Landroid/content/Context;)Ls0/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lm0/a$a;->e:Lm0/a;

    .line 17
    .line 18
    iget-object v2, p0, Lm0/a$a;->a:Ly0/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Ls0/b;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v1, v2, v0}, Lm0/a;->e(Lm0/a;Ly0/a;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lm0/a$a;->e:Lm0/a;

    .line 28
    .line 29
    invoke-static {}, Ly0/a;->w()Ly0/a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lm0/a;->d(Lm0/a;Ly0/a;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lm0/a$a;->a:Ly0/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    const-string v1, "biz"

    .line 39
    .line 40
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "offcfg|"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-boolean v3, p0, Lm0/a$a;->c:Z

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string/jumbo v3, "|"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget v3, p0, Lm0/a$a;->d:I

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v0, v1, v2}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    invoke-static {v0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    :goto_0
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
