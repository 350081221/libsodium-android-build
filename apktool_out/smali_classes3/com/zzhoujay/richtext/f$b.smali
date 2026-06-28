.class Lcom/zzhoujay/richtext/f$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/zzhoujay/richtext/f;


# direct methods
.method constructor <init>(Lcom/zzhoujay/richtext/f;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/f$b;->b:Lcom/zzhoujay/richtext/f;

    .line 5
    .line 6
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/zzhoujay/richtext/f$b;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    return-void
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
.method protected a([Ljava/lang/Void;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zzhoujay/richtext/f$b;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/widget/TextView;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/zzhoujay/richtext/f$b;->b:Lcom/zzhoujay/richtext/f;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/f;->m()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method protected b(Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/f$b;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Lcom/zzhoujay/richtext/f$b;->b:Lcom/zzhoujay/richtext/f;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/zzhoujay/richtext/f;->a(Lcom/zzhoujay/richtext/f;)Lcom/zzhoujay/richtext/g;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, Lcom/zzhoujay/richtext/g;->g:Lcom/zzhoujay/richtext/b;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zzhoujay/richtext/b;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    sget-object v2, Lcom/zzhoujay/richtext/b;->layout:Lcom/zzhoujay/richtext/b;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/zzhoujay/richtext/b;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-lt v1, v2, :cond_2

    .line 36
    .line 37
    invoke-static {}, Lcom/zzhoujay/richtext/h;->e()Lcom/zzhoujay/richtext/h;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, Lcom/zzhoujay/richtext/f$b;->b:Lcom/zzhoujay/richtext/f;

    .line 42
    .line 43
    invoke-static {v2}, Lcom/zzhoujay/richtext/f;->a(Lcom/zzhoujay/richtext/f;)Lcom/zzhoujay/richtext/g;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v2, v2, Lcom/zzhoujay/richtext/g;->a:Ljava/lang/String;

    .line 48
    .line 49
    move-object v3, p1

    .line 50
    check-cast v3, Landroid/text/SpannableStringBuilder;

    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Lcom/zzhoujay/richtext/h;->b(Ljava/lang/String;Landroid/text/SpannableStringBuilder;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/zzhoujay/richtext/f$b;->b:Lcom/zzhoujay/richtext/f;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/zzhoujay/richtext/f;->a(Lcom/zzhoujay/richtext/f;)Lcom/zzhoujay/richtext/g;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object p1, p1, Lcom/zzhoujay/richtext/g;->r:Le3/b;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget-object p1, p0, Lcom/zzhoujay/richtext/f$b;->b:Lcom/zzhoujay/richtext/f;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/zzhoujay/richtext/f;->a(Lcom/zzhoujay/richtext/f;)Lcom/zzhoujay/richtext/g;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p1, p1, Lcom/zzhoujay/richtext/g;->r:Le3/b;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-interface {p1, v0}, Le3/b;->a(Z)V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_0
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/zzhoujay/richtext/f$b;->a([Ljava/lang/Void;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/zzhoujay/richtext/f$b;->b(Ljava/lang/CharSequence;)V

    return-void
.end method
