.class public final synthetic Lcom/yuanqi/master/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/view/VerificationCodeText;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/view/VerificationCodeText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/view/a;->a:Lcom/yuanqi/master/view/VerificationCodeText;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/view/a;->a:Lcom/yuanqi/master/view/VerificationCodeText;

    invoke-static {v0, p1, p2, p3}, Lcom/yuanqi/master/view/VerificationCodeText;->a(Lcom/yuanqi/master/view/VerificationCodeText;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
