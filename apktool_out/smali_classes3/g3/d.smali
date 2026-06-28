.class public Lg3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/e;


# instance fields
.field private a:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg3/d;->a:Landroid/widget/TextView;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
.end method


# virtual methods
.method public parse(Ljava/lang/String;)Landroid/text/Spanned;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lg3/d;->a:Landroid/widget/TextView;

    invoke-static {p1, v0, v1}, Lcom/zzhoujay/markdown/b;->c(Ljava/lang/String;Landroid/text/Html$ImageGetter;Landroid/widget/TextView;)Landroid/text/Spanned;

    move-result-object p1

    return-object p1
.end method
