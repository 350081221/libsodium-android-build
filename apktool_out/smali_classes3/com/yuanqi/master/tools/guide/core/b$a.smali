.class Lcom/yuanqi/master/tools/guide/core/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/tools/guide/core/b;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/yuanqi/master/tools/guide/core/b;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/tools/guide/core/b;I)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    iput p2, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/yuanqi/master/tools/guide/core/b;->a(Lcom/yuanqi/master/tools/guide/core/b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/yuanqi/master/tools/guide/core/b;->a(Lcom/yuanqi/master/tools/guide/core/b;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v0, v1}, Lcom/yuanqi/master/tools/guide/core/b;->b(Lcom/yuanqi/master/tools/guide/core/b;I)I

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/yuanqi/master/tools/guide/core/b;->c(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/yuanqi/master/tools/guide/core/b;->d(Lcom/yuanqi/master/tools/guide/core/b;)Ly2/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/yuanqi/master/tools/guide/core/b;->d(Lcom/yuanqi/master/tools/guide/core/b;)Ly2/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ly2/b;->a(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/yuanqi/master/tools/guide/core/b;->e(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/yuanqi/master/tools/guide/core/b;->g(Lcom/yuanqi/master/tools/guide/core/b;)Landroid/content/SharedPreferences;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->b:Lcom/yuanqi/master/tools/guide/core/b;

    .line 67
    .line 68
    invoke-static {v1}, Lcom/yuanqi/master/tools/guide/core/b;->f(Lcom/yuanqi/master/tools/guide/core/b;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget v2, p0, Lcom/yuanqi/master/tools/guide/core/b$a;->a:I

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v1, "there is no guide to show!! Please add at least one Page."

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0
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
