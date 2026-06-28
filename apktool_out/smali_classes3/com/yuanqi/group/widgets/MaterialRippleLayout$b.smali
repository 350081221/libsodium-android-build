.class Lcom/yuanqi/group/widgets/MaterialRippleLayout$b;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/widgets/MaterialRippleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Lcom/yuanqi/group/widgets/MaterialRippleLayout;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$b;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    invoke-direct {p0, p2, p3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->getRippleAlpha()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->setRippleAlpha(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$b;->a(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$b;->b(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Integer;)V

    return-void
.end method
