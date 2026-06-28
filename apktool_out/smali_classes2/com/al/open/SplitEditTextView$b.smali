.class Lcom/al/open/SplitEditTextView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/al/open/SplitEditTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/al/open/SplitEditTextView;


# direct methods
.method private constructor <init>(Lcom/al/open/SplitEditTextView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/al/open/SplitEditTextView$b;->a:Lcom/al/open/SplitEditTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/al/open/SplitEditTextView;Lcom/al/open/SplitEditTextView$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView$b;-><init>(Lcom/al/open/SplitEditTextView;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/al/open/SplitEditTextView$b;->a:Lcom/al/open/SplitEditTextView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/al/open/SplitEditTextView;->a(Lcom/al/open/SplitEditTextView;)Landroid/graphics/Paint;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lcom/al/open/SplitEditTextView$b;->a:Lcom/al/open/SplitEditTextView;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/al/open/SplitEditTextView;->a(Lcom/al/open/SplitEditTextView;)Landroid/graphics/Paint;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0xff

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/al/open/SplitEditTextView$b;->a:Lcom/al/open/SplitEditTextView;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/al/open/SplitEditTextView$b;->a:Lcom/al/open/SplitEditTextView;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/al/open/SplitEditTextView;->b(Lcom/al/open/SplitEditTextView;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-long v1, v1

    .line 38
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    return-void
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
.end method
