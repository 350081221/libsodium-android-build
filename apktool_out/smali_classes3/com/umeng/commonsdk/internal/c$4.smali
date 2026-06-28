.class Lcom/umeng/commonsdk/internal/c$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/listener/OnGetOaidListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/commonsdk/internal/c;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/commonsdk/internal/c;


# direct methods
.method constructor <init>(Lcom/umeng/commonsdk/internal/c;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetOaid(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "--->>> OAID\u4e91\u63a7\u53c2\u6570\u66f4\u65b0(\u4e0d\u91c7\u96c6->\u91c7\u96c6)\uff1a\u91c7\u96c6\u5b8c\u6210"

    .line 2
    .line 3
    const-string v1, "MobclickRT"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string p1, "--->>> oaid\u8fd4\u56denull\u6216\u8005\u7a7a\u4e32\uff0c\u4e0d\u9700\u8981 \u4f2a\u51b7\u542f\u52a8\u3002"

    .line 15
    .line 16
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/c;->a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/h;->a:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "key_umeng_sp_oaid"

    .line 40
    .line 41
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :catchall_0
    :cond_1
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/umeng/commonsdk/internal/c;->a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/c;->a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x0

    .line 68
    const v2, 0x8014

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v2, v0, v1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
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
