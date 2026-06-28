.class public final synthetic Landroidx/fragment/app/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

.field public final synthetic b:Landroidx/fragment/app/SpecialEffectsController$Operation;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;Landroidx/fragment/app/SpecialEffectsController$Operation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/e;->a:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    iput-object p2, p0, Landroidx/fragment/app/e;->b:Landroidx/fragment/app/SpecialEffectsController$Operation;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/e;->a:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    iget-object v1, p0, Landroidx/fragment/app/e;->b:Landroidx/fragment/app/SpecialEffectsController$Operation;

    invoke-static {v0, v1}, Landroidx/fragment/app/DefaultSpecialEffectsController;->c(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    return-void
.end method
