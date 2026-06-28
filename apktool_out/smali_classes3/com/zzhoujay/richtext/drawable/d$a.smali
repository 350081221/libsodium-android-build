.class Lcom/zzhoujay/richtext/drawable/d$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zzhoujay/richtext/drawable/d;-><init>(Landroid/graphics/Movie;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zzhoujay/richtext/drawable/d;


# direct methods
.method constructor <init>(Lcom/zzhoujay/richtext/drawable/d;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/drawable/d$a;->a:Lcom/zzhoujay/richtext/drawable/d;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/16 v0, 0x357

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/zzhoujay/richtext/drawable/d$a;->a:Lcom/zzhoujay/richtext/drawable/d;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/zzhoujay/richtext/drawable/d;->a(Lcom/zzhoujay/richtext/drawable/d;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zzhoujay/richtext/drawable/d$a;->a:Lcom/zzhoujay/richtext/drawable/d;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zzhoujay/richtext/drawable/d;->b(Lcom/zzhoujay/richtext/drawable/d;)Landroid/widget/TextView;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lcom/zzhoujay/richtext/drawable/d$a;->a:Lcom/zzhoujay/richtext/drawable/d;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zzhoujay/richtext/drawable/d;->b(Lcom/zzhoujay/richtext/drawable/d;)Landroid/widget/TextView;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 30
    .line 31
    .line 32
    const-wide/16 v1, 0x21

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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
