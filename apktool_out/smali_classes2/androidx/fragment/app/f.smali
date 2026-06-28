.class public final synthetic Landroidx/fragment/app/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:Landroid/animation/Animator;

.field public final synthetic b:Landroidx/fragment/app/SpecialEffectsController$Operation;


# direct methods
.method public synthetic constructor <init>(Landroid/animation/Animator;Landroidx/fragment/app/SpecialEffectsController$Operation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/f;->a:Landroid/animation/Animator;

    iput-object p2, p0, Landroidx/fragment/app/f;->b:Landroidx/fragment/app/SpecialEffectsController$Operation;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/f;->a:Landroid/animation/Animator;

    iget-object v1, p0, Landroidx/fragment/app/f;->b:Landroidx/fragment/app/SpecialEffectsController$Operation;

    invoke-static {v0, v1}, Landroidx/fragment/app/DefaultSpecialEffectsController;->h(Landroid/animation/Animator;Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    return-void
.end method
